package br.com.rafaeldev.redis.exemplo4;

public class Expirar {
	
	final String codigoDoUsuario = "12345";
	final String nomeDoUsuario = "Rafael";
	final String emailDoUsuario = "rafaelvicio@icloud.com";
	
	String chave = "sessao:usuario:" + codigoDoUsuario;
	
	int trintaMinutiosEmSegundos = 1800;
	
	Map<String, String> campos = new HashMap<String, String>() {{
		put("cidigo", codigoDoUsuario);
		put("nome", nomeDoUsuario);
		put("email", emailDoUsuario);
	}};
	
	Jedis jedis = new Jedis("localhost");
	
	long resultado = jedis.expire(chave, trintaMinutiosEmSegundos);
	System.out.printLn(resultado);
	
	String resultado = jedis.hmset(chave, campos);
	System.out.printLn(resultado);

}
