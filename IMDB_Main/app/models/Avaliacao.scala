package models

import anorm.SQL
import anorm.SqlQuery
import anorm.RowParser
import anorm.Macro
import anorm.SqlStringInterpolation
import anorm.SqlParser
import play.api.db.DB
import play.api.Play.current
import javax.inject.Inject

import play.api.db.Database
import javax.inject.Singleton

/**
  * Case class Avaliacao e AvaliacaoDAO,
  * metodos do DAO que listam Avaliacoes e salvam
  */
case class Avaliacao(email: String, ID_FILME : Int, comentario: String, nota:Int)

@Singleton
class AvaliacaoDAO @Inject()(database: Database) {
  val parser: RowParser[models.Avaliacao] = Macro.namedParser[models.Avaliacao]

  def listarAvaliacoes (idFilme: Int) = database.withConnection { implicit connection =>
    SQL("SELECT EMAIL, ID_FILME, COMENTARIO, NOTA FROM AVALIACAO WHERE ID_FILME = {id}").on('id->idFilme).as(parser.*)
  }
  def salvarAvaliacao(avaliacao: Avaliacao) = database.withConnection { implicit connection =>
   SQL("INSERT INTO AVALIACAO(EMAIL, ID_FILME, COMENTARIO, NOTA) values ({email},{id},{com}, {nota})")
     .on(
       'email -> avaliacao.email,
       'id -> avaliacao.ID_FILME,
       'com -> avaliacao.comentario,
       'nota -> avaliacao.nota
     ).executeInsert()
  }
}
