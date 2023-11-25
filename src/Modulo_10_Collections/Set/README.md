## Metodos usados no exemplo da interface SET


https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html
<br>[x] toString()<br>
[x] contains()<br>
[x] toString()<br>
[x] Collections.min()<br>
[x] Collections.max()<br>
[x] iterator()<br>
[x] iterator().hasNext()<br>
[x] iterator().next()<br>
[x] size()<br>
[x] remove()<br>
[x] iterator().remove()<br>
[x] new LinkedHashMap()<br>
[x] new TreeMap()<br>
[x] clear()<br>
[x] isEmpty()<br>

Esses métodos são herdados das seguintes classes/interfaces:

add(), clear(), contains(), isEmpty(), remove(), size(): Herdadas da interface Set<E>
iterator(): Herdado da interface Iterable<E>
max(), min(): Herdados da classe Collections
toString(): Herdado da classe Object.

## Metodos usados no exemplo do ArcoIris

<br>add(E e): adiciona um elemento ao conjunto.
<br>clear(): remove todos os elementos do conjunto.
<br>isEmpty(): retorna true se o conjunto estiver vazio.
<br>iterator(): retorna um iterador sobre os elementos do conjunto.
<br>remove(Object o): remove um elemento do conjunto.
<br>size(): retorna o número de elementos no conjunto.
<br>startsWith(String prefix): retorna true se a string começa com o prefixo especificado.
<br>Arrays.asList(T... a): retorna uma lista contendo os elementos especificados.
<br>Collections.reverse(List<?> list): inverte a ordem dos elementos na lista.
<br>HashSet(): constrói um novo conjunto vazio, usando o construtor padrão.
<br>LinkedHashSet(Collection<? extends E> c): constrói um novo conjunto contendo os elementos na ordem em que foram adicionados, usando a coleção especificada.
<br>TreeSet(Collection<? extends E> c): constrói um novo conjunto ordenado contendo os elementos na ordem natural, usando a coleção especificada.<br>