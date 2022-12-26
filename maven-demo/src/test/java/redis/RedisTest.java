package redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import util.JedisDBPool;

/**
 * @author by PIG
 * 2022/10/10 17
 */
public class RedisTest {



	@Test
	public void testQuery(){
		Jedis jedis = JedisDBPool.getConnectJedis();


		String name = jedis.get("name");
		System.out.println("name = " + name);
		jedis.close();
	}




}
