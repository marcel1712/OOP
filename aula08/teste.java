//generic eh uma forma de criar classes, interfaces e metodos que trabalham com qualquer tipo de dado
//de forma generica, flxivel e segura

//evitando varios objects + cast
//cast manual eh quando voce focar uma conversao de tipo em java
//dizendo explicitamente que aquele objeto eh de um determinado tipo
//ex:
//cast manual 
Object obj = "Lena";
String nome = (String) obj;//cast manual
System.out.println(nome)

//com generics
ArrayList<String> nomes = new ArrayList<>();
nome.add("Lena")

//sem cast manual
String nome = nomes.get(0);

//serve  para screrever codigo que funciona com varios tipos de dados, sempre precisar criar uma classe de cada tipo

//sintaxe basica

public class Caixa<T>{ //<T> eh um place holder pro tipo, que pode ser qualquer coisa
//pode usar qualquer letra, mas por convencao T type E element(listas) K e V key e value(mapas)
    private T objeto;

    public void set(T obj){
        this.objeto = obj
    }

    public T get(){
        return objeto
    }
}


//genericos com metodos:
public class Until{
    public static <T> void imprimir (T valor){
        System.out.println(valor);
    }
}

//generic com collections onde mais usa na vida real

