Configurações:

Estou rodando essa aplicação com o Jetty - http://www.eclipse.org/jetty/ - e usando o plugin para iniciar a aplicação pelo maven.

Para o maven encontrar o jetty você precisa exportar a variável JETTY_HOME:

export JETTY_HOME=<jetty_path>

Para executar a aplicação: mvn jetty:run
