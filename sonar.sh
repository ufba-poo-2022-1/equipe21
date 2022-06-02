ant
sonar-scanner \
  -Dsonar.organization=ufba-poo-2022-1 \
  -Dsonar.projectKey=ufba-poo-2022-1_equipe21 \
  -Dsonar.host.url=https://sonarcloud.io \
  -Dsonar.sources=src \
	-Dsonar.java.binaries=bin
