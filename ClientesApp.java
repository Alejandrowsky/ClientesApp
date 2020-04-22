import java.util.List;
class ClientesApp{
	
	static ClienteServiceImp clienteService = new ClienteServiceImp();
	static List<Cliente> clientes;

	public static void main (String[] args){

		System.out.println("Listado de Clientes");
		System.out.println("======================");

		cargarClientes();

	}

	static void cargarClientes(){
		clientes = clienteService.buscarTodo();

		for(Cliente c : clientes){
			System.out.println("Nro: "+c.getNumero() + " | Cliente: " + c);
			System.out.println("--------------------------------------------");
		}
	}
}