public class exemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<ContaSimples> contas = new ArrayList<ContaSimples>();
		contas.add(new ContaSimples(1,"João","30/02/2002",500.5));
		contas.add(new ContaSimples(3,"Jana","30/02/2001",500));
		contas.add(new ContaSimples(2,"Denise","19/08/1899",700.8));
		for(Iterator<ContaSimples> it = contas.iterator(); it.hasNext();)
			System.out.println(it.next().toString());
		contas.get(0).transferir(contas.get(1));
		for(Iterator<ContaSimples> it = contas.iterator(); it.hasNext();)
			System.out.println(it.next().toString());
	}

}
