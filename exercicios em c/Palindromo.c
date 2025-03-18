#include <stdbool.h>
#include <stdio.h>
#include <string.h>

bool isPalindromo(char texto[]) {
  bool resp = true;

  for (int i = 0, j = (strlen(texto) - 1); i <= j; i++, j--) {
    if (texto[i] != texto[j]) {
      resp = false;
    }
  }

  return resp;
}

int main() {
  char texto[500];

  scanf("%[^\n]", texto);
  getchar();

  while (!(strlen(texto) == 3 && texto[0] == 'F' && texto[1] == 'I' &&
           texto[2] == 'M')) {

    if (isPalindromo(texto)) {
      printf("SIM\n");
    } else {
      printf("NAO\n");
    }

    scanf(" %[^\n]", texto);
    getchar();
  }
  return 0;
}