# Stream
<br>[x] classe anônima
<br>[x] functional interface
<br>Qualquer interface com um SAM (Single Abstract Method) é uma interface funcional e sua implementação pode ser tratada como expressões lambda.
<br>https://www.baeldung.com/java-8-functional-interfaces
<br>[x] Comparator
<br>[x] lambda '->'
<br>É uma função anônima com a qual podemos lidar como um cidadão de língua de primeira classe. Por exemplo, podemos passá-lo ou retorná-lo de um método.
<br>https://www.baeldung.com/java-8-lambda-expressions-tips
<br>[] reference method '::'
<br>É um tipo especial de expressões lambda. Eles costumam ser usado para criar expressões lambda simples fazendo referência a métodos existentes.
<br>https://www.baeldung.com/java-method-references

# Stream API

<br>[x] stream - Fluxo de dados que não altera a coleção
<br>https://www.oracle.com/br/technical-resources/articles/java-stream-api.html
<br>https://medium.com/@racc.costa/streams-no-java-8-e-no-java-9-36177c5c3313
<br>https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
<br>[x] operações intermediárias - Permite operações encadeadas
<br>[x] operações finais - Fecha o fluxo
<br>https://www.geeksforgeeks.org/stream-in-java/
<br>---
<br>[x] forEach(new Consumer())
<br>[x] skip()
<br>[x] collect(Collectors.joining())
<br>[x] distinct()
<br>[x] count()
<br>[x] limit()
<br>[x] collect(Collectors.toSet())
<br>[x] map(new Function())
<br>[x] collect(Collectors.toList())
<br>[x] filter (new Function())
<br>[x] sorted()
<br>[x] sum()
<br>[x] average()
<br>[x] ifPresent()
<br>https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html
<br>://www.baeldung.com/java-optional
<br>[x] min
<br>[x] max
<br>*[x] removeIf(new Predicate())
<br>[x] collect(Collectors.groupingBy(new Function())

