# Pitest
Framework para mutação de dados em testes, podendo variar seu nível de acordo com a necessidade.

Para utilizar basta importar a depedência:

ˋˋˋ
 <dependency>
            <groupId>org.pitest</groupId>
            <artifactId>pitest</artifactId>
            <version>1.5.2</version>
 </dependency>
ˋˋˋ


Na raiz do projeto, execute:

> mvn org.pitest:pitest-maven:mutationCoverage

Assim, basta analisar os resultados e verificar a quantidade de mutantes gerados, quantos foram mortos e quantos sobrevivem.

Por fim, ajuste seu código e implemente sempre a variação de dados em seus testes automatizados.

*Para complemento da análise, na pasta target do projeto é criada uma subpasta chamada “pit-reports” onde será gerado o relatório html do resultado.*
