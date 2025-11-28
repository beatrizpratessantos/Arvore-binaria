public class Main {
public static void main(String[] args) {
ArvoreBinariaBusca<Integer> a = new ArvoreBinariaBusca<>();
int[] A = {10, 20, 30, 40, 50, 60, 70};
for (int v: A) a.inserir(v);
imprimirDiagnostico("cenário A", a);
ArvoreBinariaBusca<Integer> b = new ArvoreBinariaBusca<>();
int[] B = {70, 60, 50, 40, 30, 20, 10};
for (int v: B) b.inserir(v);
imprimirDiagnostico("cenário B", b);
ArvoreBinariaBusca<Integer> c = new ArvoreBinariaBusca<>();
int[] base = {50, 30, 70, 20, 40, 60, 80, 10, 25, 35, 45, 55, 65, 75, 85};
for (int v: base) c.inserir(v);
int[] alongar = {90, 95, 97, 98, 99};
for (int v: alongar) c.inserir(v);
imprimirDiagnostico("cenário C", c);
}
private static void imprimirDiagnostico(String titulo, ArvoreBinariaBusca<Integer> arv) {
System.out.println("\n=== " + titulo + " ===");
System.out.println("altura: " + arv.altura());
System.out.println("total de nós: " + arv.contarNos());
System.out.println("total de folhas: " + arv.contarFolhas());
arv.imprimirEmOrdem();
arv.imprimirPreOrdem();
arv.imprimirPosOrdem();
arv.imprimirPorNiveis();
}
}
