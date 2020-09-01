
package mapaprog1;

public class Principal {

    public static void main(String[] args) {
      
        Presidente pres = new Presidente(5500, 13,"Asdrubal Leônico Correa", "546.333.279-00");
        Secretaria secFat = new Secretaria(2100, 12, "Fatima", "555.786.236-01");
        Secretaria secAna = new Secretaria(2100, 11, "Ana", "545.386.231-91");
        Vendedor vendJo = new Vendedor(1500, 10, "João", "111.111.111-00");
        Vendedor vendVan = new Vendedor(1500, 9, "Vanessa", "222.222.222-00");
        Vendedor vendCar = new Vendedor(1500, 8, "Carlos", "333.333.333-00");
        Cliente cliMar = new Cliente("marcos", "123456", "Marcos", "147.258.369-91");
        Cliente cliJoa = new Cliente("joana", "teste", "Joana", "159.753.248-64");
        Cliente cliEli = new Cliente("elisa", "segredo", "Elisa", "107.248.359-60");
        Cliente cliLuc = new Cliente("lucas", "555", "Lucas", "456.987.159-00");
        System.out.println("--------------------------------------");
        vendJo.setComissao(750);
        System.out.println("O salário com comissão do vendedor João é " + vendJo.salarioMesComComissao());
        System.out.println("--------------------------------------");
        vendVan.setComissao(987);
        System.out.println("O salário com comissão do vendedor Vanessa é " + vendVan.salarioMesComComissao());
        System.out.println("--------------------------------------");
        vendCar.setComissao(395);
        System.out.println("O salário com comissão do vendedor Carlos é " + vendCar.salarioMesComComissao());
        System.out.println("--------------------------------------");
        System.out.println("O salário do presidente Asdrubal é " + pres.calcularSalarioAnual());
        System.out.println("--------------------------------------");
        System.out.println("O salário da secretária Ana é " + secAna.calcularSalarioAnual());
        System.out.println("--------------------------------------");
        System.out.println("A senha é " + cliLuc.verificaSenha("123456"));
        System.out.println("--------------------------------------");
        System.out.println("A senha é " + cliLuc.verificaSenha("segredo"));
        System.out.println("--------------------------------------");
        System.out.println("A senha é " + cliLuc.verificaSenha("teste"));
        pres.exibeDados();
        secFat.exibeDados();
        secAna.exibeDados();
        vendJo.exibeDados();
        vendVan.exibeDados();
        vendCar.exibeDados();
        cliMar.exibeDados();
        cliJoa.exibeDados();
        cliEli.exibeDados();
        cliLuc.exibeDados();
        
        
        
        
    }
    
}
