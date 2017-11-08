Reproduce false-positive warning with scala 2.12.4:

```
[warn] <path>/src/main/scala/Schema.scala:13:24: private val output in object Schema is never used
[warn]   private implicit val output = deriveObjectType[Ctx, Output]()
[warn]                        ^
[warn] one warning found
```

This warning is not emitted by scala 2.12.3
