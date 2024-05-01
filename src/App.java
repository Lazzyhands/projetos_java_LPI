public class App {
    public static void main(String[] args) throws Exception {
       Conta c1 = new Conta("123-4", 100.0);
       Conta c2 = new Conta("456-7", 50.0);
       Conta c3 = new Conta("789-0", 10);

       //Conta [] BD = {c1, c2};
       //Conta [] BD = new Conta[5];
       //BD[0] = c1;
       //BD[1] = c2;

       Repositorio BD = new Repositorio();
       BD.inserir(c1);
       BD.inserir(c2);
       BD.inserir(c3);
       BD.remover(c2);
       BD.printALL();
    }
}
