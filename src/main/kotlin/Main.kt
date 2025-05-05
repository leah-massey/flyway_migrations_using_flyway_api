import org.flywaydb.core.Flyway

fun main() {
 val flyway = Flyway.configure().dataSource("jdbc:postgresql://localhost:5432/flyway_test_2", "leahmassey", null).load()
    flyway.migrate()
}
