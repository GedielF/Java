package pintag;

import java.util.ArrayList;

public class GerenciarClientes {

    private static ArrayList<Cliente> listadeclientes = new ArrayList<>();

    public static ArrayList<Cliente> getListadeclientes() {
        return listadeclientes;
    }

    public static void adicionarCliente(Cliente c) {
        listadeclientes.add(c);
    }

    public static void listarClientes() {
        String saida = "";
        saida += "\n====== Lista de Clientes ======\n";
        int id = 1;
        for (Cliente c : listadeclientes) {
            saida += "\n=== Cliente ID: " + id++ + " ===\n";
            saida += c.imprimir() + "\n";
        }
        System.out.println(saida);
    }

    public static void pesquisarNome(String nome) {
        String saida = "";
        saida += "\n====== Resultado da pesquisa: " + nome + " ======\n";
        boolean achou = false;
        int id = 0;
        for (Cliente c : listadeclientes) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                saida += "\n === Cliente ID: " + id++ + "===\n";
                saida += c.imprimir() + "\n";
                achou = true;
            }
        }
        if (achou == false) {
            saida += "\n Nenhum resultado encontrado!\n";
        }
        System.out.println(saida);
    }
    
        public static void pesquisarEmail(String email) {
        String saida = "";
        saida += "\n====== Resultado da pesquisa: " + email + " ======\n";
        boolean achou = false;
        int id = 0;
        for (Cliente c : listadeclientes) {
            if (c.getNome().equalsIgnoreCase(email)) {
                saida += "\n === Cliente ID: " + id++ + "===\n";
                saida += c.imprimir() + "\n";
                achou = true;
            }
        }
        if (achou == false) {
            saida += "\n Nenhum resultado encontrado!\n";
        }
        System.out.println(saida);
    }

    public static void pesquisarTelefone(long telefone) {
        String saida = "";
        saida += "\n====== Resultado da pesquisa: " + telefone + " ======\n";
        boolean achou = false;
        int id = 0;
        for (Cliente c : listadeclientes) {
            if (c.getTelefone() == telefone) {
                saida += "\n=== Cliente ID: " + id++ + " ===\n";
                saida += c.imprimir() + "\n";
                achou = true;
            }
        }
        if (achou == false) {
            saida += "\n Nenhum resultado encontrado!\n";
        }
        System.out.println(saida);
    }

    public static void pesquisarId(int identificador) {
        String saida = "";
        saida += "\n====== Resultado da pesquisa: " + identificador + " ======\n";
        boolean achou = false;
        int id = 0;
        for (Cliente c : listadeclientes) {
            if (id == identificador) {
                saida += "\n=== Cliente ID: " + id++ + "===\n";
                saida += c.imprimir() + "\n";
                achou = true;
            }
        }
        if (achou == false) {
            saida += "\n Nenhum resultado encontrado!\n";
        }
        System.out.println(saida);
    }

    public static boolean removerClienteNome(String nome) {
        for (Cliente c : listadeclientes) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                listadeclientes.remove(c);
                return true;
            }
        }
        return false;
    }

    public static boolean removerClienteTelefone(long telefone) {
        for (Cliente c : listadeclientes) {
            if (c.getTelefone() == telefone) {
                listadeclientes.remove(c);
                return true;
            }
        }
        return false;
    }

    public static boolean removerClienteId(int identificador) {
        int id = 0;
        for (Cliente c : listadeclientes) {
            if (id == identificador) {
                listadeclientes.remove(c);
                return true;
            }
        }
        return false;
    }
}
