package LojaVirtual;

public class Loja {
    private String name;
    private String productName;
    private double price;
    private double valorTotal;
    private int qtd;

    public Loja() {

    }

    public Loja(String name, String productName, double price) {

        this.name = name;
        this.productName = productName;
        this.price = price;


    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double preco) {
        this.price = preco;
    }

    public int getQtd() {
        return qtd;
    }


    public void setQtd(int quantidade) {
        this.qtd = quantidade;
    }


    public double valorTotal() {
        return valorTotal;
    }

    public void adicionarProduto(double preco, int quantidade) {
        valorTotal += preco * quantidade;
    }

    public double aVista() {
        return valorTotal * 0.9;
    }

    public double parcelado() {
        return valorTotal * 1.05;
    }
}

