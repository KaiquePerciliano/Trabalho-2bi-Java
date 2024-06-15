import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        List<Veiculo> veiculos = new ArrayList<>();
        List<Servico> servicos = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);

        int opt = 0;

        do {
            System.out.println("""
            \n=== Sistema de Gerenciamento de Oficina Mecânica ===
            1. Cadastrar
            2. Listar
            3. Visualizar
            4. Excluir
            5. Editar
            0. Sair
            Escolha uma opção: 
            """);
            opt = teclado.nextInt();

            if (opt == 1) {
                System.out.println("""
                        -----Cadastro-----
                        1. Cadastrar Funcionário
                        2. Cadastrar Cliente
                        3. Cadastrar Veiculo
                        4. Cadastrar Serviço
                        """);
                int optCadastro = teclado.nextInt();

                switch (optCadastro) {
                    case 1:

                        System.out.println("\n-----Cadastrar Funcionário-----\n");

                        System.out.println("ID: ");
                        int idFuncionario = teclado.nextInt();

                        System.out.println("NOME: ");
                        String nomeFuncionario = teclado.next();

                        System.out.println("TELEFONE: ");
                        String telefoneFuncionario = teclado.next();

                        System.out.println("SALARIO: R$");
                        double salarioFuncionario = teclado.nextDouble();

                        System.out.println("TIPO ( 1= MECANICO, 2= ATENDENTE): ");
                        int tipo = teclado.nextInt();

                        Funcionario funcionario;

                        if (tipo == 1) {
                            funcionario = new Mecanico(idFuncionario, nomeFuncionario, telefoneFuncionario, salarioFuncionario);
                        } else if (tipo == 2) {
                            funcionario = new Atendente(idFuncionario, nomeFuncionario, telefoneFuncionario, salarioFuncionario);
                        } else {
                            System.out.println("Tipo inválido! Funcionário não cadastrado.");
                            return;
                        }

                        funcionarios.add(funcionario);
                        break;

                    case 2:

                        System.out.println("\n-----Cadastrar Cliente-----\n");

                        System.out.println("ID: ");
                        int idCliente = teclado.nextInt();

                        System.out.println("NOME: ");
                        String nomeCliente = teclado.next();

                        System.out.println("TELEFONE: ");
                        String telefoneCliente = teclado.next();

                        System.out.println("CPF: ");
                        String cpfCliente = teclado.next();

                        Cliente cliente;

                        cliente = new Cliente(idCliente, nomeCliente, telefoneCliente, cpfCliente);

                        clientes.add(cliente);
                        break;

                    case 3:

                        System.out.println("\n-----Cadastrar Veículo-----\n");

                        System.out.println("ID: ");
                        int idVeiculo = teclado.nextInt();

                        System.out.println("MARCA: ");
                        String marcaVeiculo = teclado.next();

                        System.out.println("MODELO: ");
                        String modeloVeiculo = teclado.next();

                        System.out.println("ANO: ");
                        int anoVeiculo = teclado.nextInt();

                        System.out.println("PLACA: ");
                        String placaVeiculo = teclado.next();

                        Veiculo veiculo;

                        veiculo = new Veiculo(idVeiculo, marcaVeiculo, modeloVeiculo, anoVeiculo, placaVeiculo);

                        veiculos.add(veiculo);

                        break;
                    case 4:

                        System.out.println("\n-----Cadastrar Serviço-----\n");

                        System.out.println("ID: ");
                        int idServico = teclado.nextInt();

                        System.out.println("DESCRICAO: ");
                        String descricaoServico = teclado.next();

                        System.out.println("PREÇO: R$");
                        double precoServico = teclado.nextDouble();

                        Servico servico;

                        servico = new Servico(idServico, descricaoServico, precoServico);

                        servicos.add(servico);

                        break;

                }

            } else if (opt == 2) {
                System.out.println("""
                        ----Listagem----
                        1. Listar Funcionários
                        2. Listar Clientes
                        3. Listar Veiculos
                        4. Listar Serviços
                        """);

                int optListagem = teclado.nextInt();

                switch (optListagem) {

                    case 1:
                        System.out.println("\n------Listar Funcionários------\n");

                        if (funcionarios.isEmpty()) {
                            System.out.println("Nenhum Funcionário cadastrado!");
                        }else {
                            for (Funcionario funcionario : funcionarios) {
                                System.out.println(funcionario.getDadosPessoais());
                            }
                        }

                        break;

                    case 2:
                        System.out.println("\n------Listar Clientes------\n");

                        if (clientes.isEmpty()) {
                            System.out.println("Nenhum Cliente cadastrado!");
                        }else {
                            for (Cliente cliente : clientes) {
                                System.out.println(cliente.getDadosPessoais());
                            }
                        }

                        break;

                    case 3:
                        System.out.println("\n------Listar Veiculos------\n");

                        if (veiculos.isEmpty()) {
                            System.out.println("Nenhum Veiculo cadastrado!");
                        }else {
                            for (Veiculo veiculo : veiculos) {
                                System.out.println(veiculo.getDadosTecnicos());
                            }
                        }

                    case 4:
                        System.out.println("\n------Listar Serviços------\n");

                        if (servicos.isEmpty()) {
                            System.out.println("Nenhum Serviço cadastrado!");
                        }else {
                            for (Servico servico : servicos) {
                                System.out.println(servico.getDadosTecnicos());
                            }
                        }
                }

            }else if (opt == 3) {
                System.out.println("""
                        ----Visualizar----
                        1. Visualizar Funcionários
                        2. Visualizar Clientes
                        3. Visualizar Veiculos
                        4. Visualizar Serviços
                        """);

                int optVisualizacao = teclado.nextInt();

                switch (optVisualizacao) {
                    case 1:
                        System.out.println("\n-----Visualizar Funcionário-----\n");

                        System.out.print("ID: ");
                        int idFuncionario = teclado.nextInt();

                        Funcionario funcionario = null;

                        for (Funcionario f : funcionarios) {
                            if (f.getId() == idFuncionario) {
                                funcionario = f;
                            }
                        }

                        if (funcionario != null) {
                            System.out.println(funcionario.getDadosPessoais());
                        }else {
                            System.out.println("Funcionário não encontrado.");
                        }

                        break;

                    case 2:
                        System.out.println("\n-----Visualizar Clientes-----\n");

                        System.out.print("ID: ");
                        int idCliente = teclado.nextInt();

                        Cliente cliente = null;

                        for (Cliente c : clientes) {
                            if (c.getId() == idCliente) {
                                cliente = c;
                            }
                        }

                        if (cliente != null) {
                            System.out.println(cliente.getDadosPessoais());
                        }else {
                            System.out.println("Cliente não encontrado.");
                        }

                        break;

                    case 3:
                        System.out.println("\n-----Visualizar Veículo-----\n");

                        System.out.print("ID: ");
                        int idVeiculo = teclado.nextInt();

                        Veiculo veiculo = null;

                        for (Veiculo v : veiculos) {
                            if (v.getId() == idVeiculo) {
                                veiculo = v;
                            }
                        }

                        if (veiculo != null) {
                            System.out.println(veiculo.getDadosTecnicos());
                        }else {
                            System.out.println("Veículo não encontrado.");
                        }

                        break;

                    case 4:
                        System.out.println("\n-----Visualizar Serviço-----\n");

                        System.out.print("ID: ");
                        int idServico = teclado.nextInt();

                        Servico servico = null;

                        for (Servico s : servicos) {
                            if (s.getId() == idServico) {
                                servico = s;
                            }
                        }

                        if (servico != null) {
                            System.out.println(servico.getDadosTecnicos());
                        }else {
                            System.out.println("Serviço não encontrado.");
                        }

                        break;
                }

            } else if (opt == 4) {
                System.out.println("""
                        ----Excluir----
                        1. Excluir Funcionários
                        2. Excluir Clientes
                        3. Excluir Veiculos
                        4. Excluir Serviços
                        """);

                int optExclusao = teclado.nextInt();

                switch (optExclusao) {
                    case 1:
                        System.out.println("\n-----Excluir Funcionário-----\n");

                        System.out.print("ID: ");
                        int idFuncionario = teclado.nextInt();

                        Funcionario funcionario = null;

                        for (Funcionario f : funcionarios) {
                            if (f.getId() == idFuncionario) {
                                funcionario = f;
                            }
                        }

                        if (funcionario != null) {
                            funcionarios.remove(funcionario);
                            System.out.println("Funcionário excluído com sucesso!");
                        }else {
                            System.out.println("Funcionário não encontrado.");
                        }

                        break;

                    case 2:
                        System.out.println("\n-----Excluir Cliente-----\n");

                        System.out.print("ID: ");
                        int idCliente = teclado.nextInt();

                        Cliente cliente = null;

                        for (Cliente c : clientes) {
                            if (c.getId() == idCliente) {
                                cliente = c;
                            }
                        }

                        if (cliente != null) {
                            clientes.remove(cliente);
                            System.out.println("Cliente excluído com sucesso!");
                        }else {
                            System.out.println("Cliente não encontrado.");
                        }

                        break;

                    case 3:
                        System.out.println("\n-----Excluir Veículo-----\n");

                        System.out.print("ID: ");
                        int idVeiculo = teclado.nextInt();

                        Veiculo veiculo = null;

                        for (Veiculo v : veiculos) {
                            if (v.getId() == idVeiculo) {
                                veiculo = v;
                            }
                        }

                        if (veiculo != null) {
                            veiculos.remove(veiculo);
                            System.out.println("Veículo excluído com sucesso!");
                        }else {
                            System.out.println("Veículo não encontrado.");
                        }

                        break;

                    case 4:
                        System.out.println("\n-----Excluir Serviço-----\n");

                        System.out.print("ID: ");
                        int idServico = teclado.nextInt();

                        Servico servico = null;

                        for (Servico s : servicos) {
                            if (s.getId() == idServico) {
                                servico = s;
                            }
                        }

                        if (servico != null) {
                            servicos.remove(servico);
                            System.out.println("Serviço excluído com sucesso!");
                        }else {
                            System.out.println("Serviço não encontrado.");
                        }

                        break;
                }

            } else if (opt == 5) {
                System.out.println("""
                        ----Edição----
                        1. Editar Funcionário
                        2. Editar Cliente
                        3. Editar Veículo
                        4. Editar Serviços
                        """);

                int optEdicao = teclado.nextInt();

                switch (optEdicao) {
                    case 1:
                        System.out.println("\n-----Edição de Funcionário-----\n");

                        System.out.println("ID: ");
                        int idFuncionario = teclado.nextInt();

                        Funcionario funcionario = null;

                        for (Funcionario f : funcionarios) {
                            if (f.getId() == idFuncionario){
                                funcionario = f;
                            }
                        }

                        if (funcionario != null) {
                            System.out.println("""
                                    ---O que deseja Editar?
                                    1. Nome
                                    2. Telefone
                                    3. Salário
                                    """);


                            int optEdicaoFuncionario = teclado.nextInt();



                            switch (optEdicaoFuncionario) {
                                case 1:
                                    System.out.println("Nome atual: " + funcionario.getNome());
                                    System.out.println("\nNovo Nome: ");
                                    funcionario.setNome(teclado.next());

                                    System.out.println("Edição Realizada!");

                                    break;

                                case 2:
                                    System.out.println("Telefone atual: " + funcionario.getTelefone());
                                    System.out.println("\nNovo Telefone: ");
                                    funcionario.setTelefone(teclado.next());

                                    System.out.println("Edição Realizada!");

                                    break;

                                case 3:
                                    System.out.println("Salário atual: " + funcionario.getSalario());
                                    System.out.println("\nNovo Salário: ");
                                    funcionario.setSalario(teclado.nextDouble());

                                    System.out.println("Edição Realizada!");

                                    break;

                            }
                        }
                        break;

                    case 2:
                        System.out.println("\n-----Edição de Cliente-----\n");

                        System.out.println("ID: ");
                        int idCliente = teclado.nextInt();

                        Cliente cliente = null;

                        for (Cliente c : clientes) {
                            if (c.getId() == idCliente){
                                cliente = c;
                            }
                        }

                        if (cliente != null) {
                            System.out.println("""
                                    ---O que deseja Editar?
                                    1. Nome
                                    2. Telefone
                                    3. CPF
                                    """);


                            int optEdicaoCliente = teclado.nextInt();



                            switch (optEdicaoCliente) {
                                case 1:
                                    System.out.println("Nome atual: " + cliente.getNome());
                                    System.out.println("\nNovo Nome: ");
                                    cliente.setNome(teclado.next());

                                    System.out.println("Edição Realizada!");

                                    break;

                                case 2:
                                    System.out.println("Telefone atual: " + cliente.getTelefone());
                                    System.out.println("\nNovo Telefone: ");
                                    cliente.setTelefone(teclado.next());

                                    System.out.println("Edição Realizada!");

                                    break;

                                case 3:
                                    System.out.println("CPF atual: " + cliente.getCpf());
                                    System.out.println("\nNovo CPF: ");
                                    cliente.setCpf(teclado.next());

                                    System.out.println("Edição Realizada!");

                                    break;

                            }
                        }

                        break;

                    case 3:
                        System.out.println("\n-----Edição de Veículo-----\n");

                        System.out.println("ID: ");
                        int idVeiculo = teclado.nextInt();

                        Veiculo veiculo = null;

                        for (Veiculo v : veiculos) {
                            if (v.getId() == idVeiculo){
                                veiculo = v;
                            }
                        }

                        if (veiculo != null) {
                            System.out.println("""
                                    ---O que deseja Editar?
                                    1. Marca
                                    2. Modelo
                                    3. Ano
                                    4. Placa
                                    """);


                            int optEdicaoVeiculo = teclado.nextInt();



                            switch (optEdicaoVeiculo) {
                                case 1:
                                    System.out.println("Marca atual: " + veiculo.getMarca());
                                    System.out.println("\nNova Marca: ");
                                    veiculo.setMarca(teclado.next());

                                    System.out.println("Edição Realizada!");

                                    break;

                                case 2:
                                    System.out.println("Modelo atual: " + veiculo.getModelo());
                                    System.out.println("\nNovo Modelo: ");
                                    veiculo.setModelo(teclado.next());

                                    System.out.println("Edição Realizada!");

                                    break;

                                case 3:
                                    System.out.println("Ano atual: " + veiculo.getAno());
                                    System.out.println("\nNovo Ano: ");
                                    veiculo.setAno(teclado.nextInt());

                                    System.out.println("Edição Realizada!");

                                    break;

                                case 4:
                                    System.out.println("Placa atual: " + veiculo.getPlaca());
                                    System.out.println("\nNova Placa: ");
                                    veiculo.setPlaca(teclado.next());

                                    System.out.println("Edição Realizada!");

                                    break;
                            }
                        }

                        break;

                    case 4:
                        System.out.println("\n-----Edição de Serviços-----\n");

                        System.out.println("ID: ");
                        int idServico = teclado.nextInt();

                        Servico servico = null;

                        for (Servico s : servicos) {
                            if (s.getId() == idServico){
                                servico = s;
                            }
                        }

                        if (servico != null) {
                            System.out.println("""
                                    ---O que deseja Editar?
                                    1. Descrição
                                    2. Preço
                                    """);


                            int optEdicaoServico = teclado.nextInt();



                            switch (optEdicaoServico) {
                                case 1:
                                    System.out.println("Descrição atual: " + servico.getDescricao());
                                    System.out.println("\nNova Descrição: ");
                                    servico.setDescricao(teclado.next());

                                    System.out.println("Edição Realizada!");

                                    break;

                                case 2:
                                    System.out.println("Preço atual: " + servico.getPreco());
                                    System.out.println("\nNovo Preço: ");
                                    servico.setPreco(teclado.nextInt());

                                    System.out.println("Edição Realizada!");

                                    break;
                            }
                        }

                        break;
                }
            }
        } while (opt != 0);
    }
}