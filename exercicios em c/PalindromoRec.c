#include <stdbool.h>
#include <stdio.h>
#include <string.h>

bool isPalindromo(char texto[], int i) {
  bool resp = true;

  if (strlen(texto) / 2 != i) {
    if ((texto[i] != texto[strlen(texto) - 1 - i]) &&
        (i != strlen(texto) - 1 - i)) {
      resp = false;
    } else {
      resp = isPalindromo(texto, i + 1);
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

    if (isPalindromo(texto, 0)) {
      printf("SIM\n");
    } else {
      printf("NAO\n");
    }

    scanf(" %[^\n]", texto);
    getchar();
  }
  return 0;
}