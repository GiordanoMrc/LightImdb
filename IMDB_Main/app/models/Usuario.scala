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
  * Case class Usuario e sua classe que acompanha,
  * so executa uma busca po email.
  */

case class Usuario(email: String, senha: String)

@Singleton
class UsuarioDAO @Inject() (database: Database)  {
  val parser : RowParser[models.Usuario] = Macro.namedParser[models.Usuario]


  def procuraUsuario(usuario: Usuario) = database.withConnection {implicit connection =>
    SQL("SELECT * FROM TB_USUARIO WHERE EMAIL={email};").on('email -> usuario.email).as(parser.single)
  }
}