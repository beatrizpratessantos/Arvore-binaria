import java.util.;
public class ArvoreBinariaBusca<T extends Comparable<T>> {
private No<T> raiz;
public void inserir(T valor) {
raiz = inserirRec(raiz, valor);
}
private No<T> inserirRec(No<T> atual, T valor) {
if (atual == null) return new No<>(valor);
int cmp = valor.compareTo(atual.valor);
if (cmp < 0) atual.esquerda = inserirRec(atual.esquerda, valor);
else if (cmp > 0) atual.direita = inserirRec(atual.direita, valor);
return atual;
}
public int altura() {
return alturaRec(raiz);
}
private int alturaRec(No<T> no) {
if (no == null) return 0;
int hEsq = alturaRec(no.esquerda);
int hDir = alturaRec(no.direita);
return 1 + Math.max(hEsq, hDir);
}
public int contarNos() {
return contarNosRec(raiz);
}
private int contarNosRec(No<T> no) {
if (no == null) return 0;
return 1 + contarNosRec(no.esquerda) + contarNosRec(no.direita);
}
public int contarFolhas() {
return contarFolhasRec(raiz);
}
private int contarFolhasRec(No<T> no) {
if (no == null) return 0;
if (no.esquerda == null && no.direita == null) return 1;
return contarFolhasRec(no.esquerda) + contarFolhasRec(no.direita);
}
public void imprimirEmOrdem() {
System.out.print("em ordem: ");
emOrdemRec(raiz);
System.out.println();
}
private void emOrdemRec(No<T> no) {
if (no == null) return;
emOrdemRec(no.esquerda);
System.out.print(no.valor + " ");
emOrdemRec(no.direita);
}
public void imprimirPreOrdem() {
System.out.print("pré ordem: ");
preOrdemRec(raiz);
System.out.println();
}
private void preOrdemRec(No<T> no) {
if (no == null) return;
System.out.print(no.valor + " ");
preOrdemRec(no.esquerda);
preOrdemRec(no.direita);
}
public void imprimirPosOrdem() {
System.out.print("pós ordem: ");
posOrdemRec(raiz);
System.out.println();
}
private void posOrdemRec(No<T> no) {
if (no == null) return;
posOrdemRec(no.esquerda);
posOrdemRec(no.direita);
System.out.print(no.valor + " ");
}
public void imprimirPorNiveis() {
System.out.println("por níveis:");
if (raiz == null) {
System.out.println("vazia");
return;
}
Queue<No<T>> fila = new LinkedList<>();
fila.offer(raiz);
while (!fila.isEmpty()) {
int qtd = fila.size();
for (int i = 0; i < qtd; i++) {
No<T> n = fila.poll();
System.out.print(n.valor + " ");
if (n.esquerda != null) fila.offer(n.esquerda);
if (n.direita != null) fila.offer(n.direita);
}
System.out.println();
}
}
}