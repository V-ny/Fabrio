package fabrio;

public class produto {
    private String modelo;
    private int anoFabricacao;
    private double valor;
    private double descontoAVista;
    private double totalVendas;
    
    public produto(String modelo,int anoFabricacao, double valor, double descontoAVista, double totalVendas){
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.valor = valor;
        this.descontoAVista = descontoAVista;
        this.totalVendas = 0.0;
    }
    
    public double precoAVista(){
        return valor - (valor*descontoAVista / 100);
    }
    public double precoAPrazo(int numParcelas){
        double acrescimo = 1 + (0.02 * numParcelas);
        return valor + acrescismo;
    }
    
    public void Venda(double valorVenda){
        this.totalVendas += valorVenda;
    }
    public void Estorno(double valorEstorno){
        this.totalVendas -= valorEstorno;
    }
    
    @Override
    public String toString(){
        return String.format("Modelo: %s\nAno de fabricacao: %d\nvalor: %.2f\nDesconto a vista: %.2f\nTotal de vendas: %.2f", modelo,anoFabricacao,valor,descontoAVista,totalVendas);
    }
    
}
//public String getModelo(){
//        return modelo;
//    }
//    public void setModelo(String modelo){
//        this.modelo = modelo;
//    }
//    public int getAnoFabricacao(){
//        return anoFabricacao;
//    }
//    public void setAnoFabricacao(int anoFabricacao){
//        this.anoFabricacao = anoFabricacao;
//    }
//    public double getValor(){
//        return valor;
//    }
//    public void setValor(double valor){
//        this.valor = valor;
//    }
//    public double getDescontoAVista(){
//        return descontoAVista;
//    }
//    public void setDescontoAVista(double descontoAVista){
//        this.descontoAVista = descontoAVista;
//    }