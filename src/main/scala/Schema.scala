import sangria.macros.derive.{GraphQLField, deriveContextObjectType, deriveObjectType}

case class Output(s: String)

class GraphQLQuery {
  @GraphQLField
  def ouput(): Output = ???
}

object Schema {
  case class Ctx(query: GraphQLQuery)

  private implicit val output = deriveObjectType[Ctx, Output]()
  // [warn] private val output in object Schema is never used
  // [warn]   private implicit val output = deriveObjectType[Ctx, Output]()
  // [warn]                        ^
  // [warn] one warning found

  val query = deriveContextObjectType[Ctx, GraphQLQuery, Unit](_.query)
}
