package pintag;

import java.util.Scanner;

public class Pitangteste {

    public static void main(String[] args) {
        Scanner escrever = new Scanner(System.in);
        int menuNumero;
        do {
            exibirMenuPrincipal();
            menuNumero = escrever.nextInt();
            
            switch(menuNumero) {
                case 1:
                    MenuCompletoCliente();
                    break;
                case 3:
                    System.out.println("Saindo..");
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    
            }
            
        } while (menuNumero!=3);
              
        
    }
    //Menu Principal
    static void exibirMenuPrincipal() {
        System.out.println("\n======= Menu =======");
        System.out.println("1 - Usuario");
        System.out.println("3 - Sair");
        System.out.println("=================================\"");
    }
    //Menus Cliente 
    static void exibirMenuCliente() {
        System.out.println("\n======= Menu do Usuario =======");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Remover Cliente");
        System.out.println("3 - Pesquisar Cliente");
        System.out.println("4 - Ver lista de Clientes");
        System.out.println("5 - Sair");
    }

    static void exibirMenuCliente2() {
        System.out.println("1 - Remover pela Email");
        System.out.println("2 - Remover pelo telefone");
        System.out.println("3 - Remover pelo nome");
        System.out.println("4 - Remover pelo ID");
        System.out.println("5 - Voltar");
    }

    static void exibirMenuCliente3() {
        System.out.println("1 - Pesquisar pelo Nome");
        System.out.println("2 - Pesquisar pelo Email");
        System.out.println("3 - Pesquisar pelo telefone");
        System.out.println("4 - Pesquisar pelo ID");
        System.out.println("5 - Voltar");
    }
    

    //Metodos
    
    static void MenuCompletoCliente() {
        Scanner ler = new Scanner(System.in);
        Scanner lerString = new Scanner(System.in);

        int menuc, menuc2, menuc3;
        Cliente objCliente;
        String nome;
        String email = "";
        long telefone;
        int id;
        long senha;

        
        do {
            exibirMenuCliente();
            menuc = ler.nextInt();

            switch (menuc) {
                case 1: //Cadastrar cliente
                    System.out.println("=== Cadastrar Cliente ===\n");
                    System.out.println("\nDigite o Nome: ");
                    nome = lerString.nextLine();
                    System.out.println("\nDigite o Email: ");
                    email = lerString.nextLine();
                    System.out.println("\nDigite o Senha: ");
                    senha = ler.nextLong();
                    System.out.println("\nDigite o Telefone: ");
                    telefone = ler.nextLong();

                    //criar objeto
                    objCliente = new Cliente(nome,email, telefone, senha);
                    //add no arraylist
                    GerenciarClientes.adicionarCliente(objCliente);
                    break;
                case 2: //Remover Cliente
                    do {
                        exibirMenuCliente2();
                        menuc2 = ler.nextInt();
                        switch (menuc2) {
                            case 1: //remover por senha
                                
                                break;
                            case 2: //remover por telefone
                                System.out.println("Digite o telefone: ");
                                telefone = ler.nextLong();
                                if (!(GerenciarClientes.getListadeclientes().isEmpty())) {
                                    if (GerenciarClientes.removerClienteTelefone(telefone)) {
                                        System.out.println("Removido com sucesso!");
                                    } else {
                                        System.out.println("Cliente não encontrado!");
                                    }
                                } else {
                                    System.out.println("Não existem clientes cadastrados!");
                                }
                                break;
                            case 3: //remover por nome
                                System.out.println("Digite o nome: ");
                                nome = lerString.nextLine();
                                if (!(GerenciarClientes.getListadeclientes().isEmpty())) {
                                    if (GerenciarClientes.removerClienteNome(nome)) {
                                        System.out.println("Removido com sucesso!");
                                    } else {
                                        System.out.println("Cliente não encontrado!");
                                    }
                                } else {
                                    System.out.println("Não existem clientes cadastrados!");
                                }
                                break;
                            case 4: //remover por ID
                                System.out.println("Digite o id: ");
                                id = ler.nextInt();
                                if (!(GerenciarClientes.getListadeclientes().isEmpty())) {
                                    if (GerenciarClientes.removerClienteId(id)) {
                                        System.out.println("Removido com sucesso!");
                                    } else {
                                        System.out.println("Cliente não encontrado!");
                                    }
                                } else {
                                    System.out.println("Não existem clientes cadastrados!");
                                }
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opção Invalida!");
                        }
                    } while (menuc2 != 5);

                    break;
                case 3:
                    do {
                        exibirMenuCliente3();
                        menuc3 = ler.nextInt();

                        switch (menuc3) {
                            case 1: // pesquisar senha
                              // pesquisar nome
                                System.out.println("=== Pesquisar pelo nome ===");
                                System.out.println("Digite o nome: ");
                                nome = lerString.nextLine();
                                GerenciarClientes.pesquisarNome(nome);
                                break;
                            case 2:
                                
                            case 3: // pesquisar telefone
                                System.out.println("=== Pesquisar pelo telefone ===");
                                System.out.println("Digite o telefone: ");
                                telefone = ler.nextLong();
                                GerenciarClientes.pesquisarTelefone(telefone);
                                break;
                            case 4: // pesquisar id
                                System.out.println("=== Pesquisar pelo ID ===");
                                System.out.println("Digite o id: ");
                                id = ler.nextInt();
                                GerenciarClientes.pesquisarId(id);
                                break;
                            case 5: // voltar
                                break;
                            default:
                                System.out.println("Opcao invalida");
                        }

                    } while (menuc3 != 5);
                    break;
                case 4:
                    if (!(GerenciarClientes.getListadeclientes().isEmpty())) {
                        GerenciarClientes.listarClientes();
                    } else {
                        System.out.println("\nNão há clientes cadastrados!");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        } while (menuc != 5);
        
    }
  
    
}
