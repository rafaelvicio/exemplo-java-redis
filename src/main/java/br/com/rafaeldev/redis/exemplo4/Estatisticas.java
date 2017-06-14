package br.com.rafaeldev.redis.exemplo4;

public class Estatisticas {
	
	public void gerarEstatisticas(String pagina, String data){
		String chave = String.format("pagina:%s:%s", pagina, data);
		Jedis jedis = new Jedis("localhost");
		long resultado = jedis.incrr(chave);
		System.out.println(String.format("página %s teve %d acess(s) em %s",pagina, resultado, data));
	}
	
	public static void main(String[] args){
		String data = "02/09/2013";
		String[] paginasVisitadas = {
				"/inicio",
				"/contato",
				"/sobre",
				"/tods",
				"/dados-redis"
		};
	}
	

	

}
