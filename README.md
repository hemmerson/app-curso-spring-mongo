:numbered:

= Sistema Cursos API (Backend) image:https://github.com/iftopalmas/adaa/actions/workflows/api-build.yml/badge.svg[api-build,link=https://github.com/iftopalmas/adaa/actions/workflows/api-build.yml] image:https://github.com/iftopalmas/adaa/actions/workflows/api-staging.yml/badge.svg[fly.io api staging,link=https://github.com/iftopalmas/adaa/actions/workflows/api-staging.yml]

Backend em Java 17 com SpringBoot 3, fornecendo uma API
REST para ser acessada pela aplicação frontend.

== Configurar Ambiente de Desenvolvimento

=== JDK

Requer o JDK 17 que pode ser baixado diretamente pelo IntelliJ.
Mas ele pode ser instalado no Ubuntu com:

[source,bash]
----
sudo apt update
sudo apt install openjdk-17-jdk

----

Ou usando o http://sdkman.io[sdkman] em Linux e macOS.

=== IDE

O melhor IDE para desenvolvimento do projeto é o IntelliJ, pois tem excelente suporte ao Spring.
É sugerida a instalação das extensões:

* https://plugins.jetbrains.com/plugin/15075-jpa-buddy[JPA Buddy]
* https://plugins.jetbrains.com/plugin/13477-git-commit-message-helper[Git Commit Message Helper]

Como o projeto usa http://projectlombok.org[Lombok] e JPA, a JPA Buddy mostra warnings quando as anotações do Lombok não estiverem sendo usadas da melhor forma.

Ao abrir o projeto no IntelliJ, ele também pede para habilitar o "Processamento de Anotações" para o Lombok funcionar. Assim, tal opção precisa ser habilitada.

=== Habilitar DevTools

Acesse as configurações do IntelliJ e habilite:

* Build, Execution, Deployment &gt; Compiler &gt; Build project automatically
* Advanced Settings &gt; Allow auto-make to start even if developed application is currently running
