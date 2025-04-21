//import org.postgresql.ds.PGSimpleDataSource
//import org.jetbrains.exposed.sql.Database

//fun main() {
//    val repoDataSource: Repository = PostgresRepo(PGSimpleDataSource().apply {
//        user = "leahmassey"
//        password = "mysecretpassword"
//        databaseName = "borrowmygarden"
//    })
//}
//
//
//interface Repository {
//}
//
//class PostgresRepo(dataSource: PGSimpleDataSource): Repository {
//    val database = Database.connect(dataSource)
//}