import java.util.List;
import java.util.ArrayList;
public class ClienteRepository{

	private List<Cliente> clientes;

	public ClienteRepository(){

		clientes = new ArrayList<>();

		//Crear la coleccion testing
		//Borrar cuando se conecte a una BD
		cliente.add(new Cliente(1, "Rodriguez", "Neymar"));
		cliente.add(new Cliente(2, "Gabi", "Gallardo"));
		cliente.add(new Cliente(3, "Camila", "Vera"));
	}

	public void setClientes(List<Cliente> clientes){
		this.clientes = cliente;
	}
		
	public List<Cliente> getClientes(){
		return this.clientes;
	}

	public void addCliente(Cliente cliente){
		cliente.add(cliente);
	}
}