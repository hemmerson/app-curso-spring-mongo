Backend em Java 17 com SpringBoot 3, fornecendo uma API REST para ser acessada pela aplicação frontend.

1. Configurar Ambiente de Desenvolvimento
1.1. JDK
Requer o JDK 17 que pode ser baixado diretamente pelo IntelliJ. Mas ele pode ser instalado no Ubuntu com:

sudo apt update
sudo apt install openjdk-17-jdk
Ou usando o sdkman em Linux e macOS.

1.2. IDE
O melhor IDE para desenvolvimento do projeto é o IntelliJ, pois tem excelente suporte ao Spring. É sugerida a instalação das extensões:

JPA Buddy

Git Commit Message Helper

Como o projeto usa Lombok e JPA, a JPA Buddy mostra warnings quando as anotações do Lombok não estiverem sendo usadas da melhor forma.

Ao abrir o projeto no IntelliJ, ele também pede para habilitar o "Processamento de Anotações" para o Lombok funcionar. Assim, tal opção precisa ser habilitada.

1.3. Habilitar DevTools
Acesse as configurações do IntelliJ e habilite:

Build, Execution, Deployment > Compiler > Build project automatically

Advanced Settings > Allow auto-make to start even if developed application is currently running
