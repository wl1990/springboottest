package springanotation;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;

public class JwtTest {
	public static void main(String[] args) throws IllegalArgumentException, JWTCreationException, UnsupportedEncodingException {
		 String accessToken = JWT.create()
                 .withIssuer("test")
                 .withSubject("1234")
                 .withExpiresAt(new Date())
                 .sign(Algorithm.HMAC256("secret"));
		 
		 JWT jwt =JWT.decode("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YTgwY2I4MTU5YzU0Y2EyMDE1OWM1NGNhMjJmMDAwMCIsImlzcyI6Im5lYnVsYSIsImV4cCI6MTQ4NTI4OTg1OH0.B5WNQrZ6FRf-G5oHH47YYgDU4aNFn4RnFVx1W6VHmec");
		 String userId = jwt.getSubject();
		 System.out.println("---"+userId);
	}
}
