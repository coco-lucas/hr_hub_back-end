package com.lucas.hr_hub.backend.infra.external.processCep;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.lucas.hr_hub.backend.domain.entities.Address;

@Service
public class ViaCepService implements ProcessCepInterface {

	@Override
	public Address getAddressByCEP(String cep) {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://viacep.com.br/ws/" + cep + "/json"))
				.build();
		HttpResponse<String> response;

		try {
			response = client.send(request, HttpResponse.BodyHandlers.ofString());
			String body = response.body();

			JsonObject addressJson = JsonParser.parseString(body).getAsJsonObject();

			Address address = new Address();
			address.setZIPcode(cep);
			address.setStreet(addressJson.get("logradouro").getAsString());
			address.setCity(addressJson.get("localidade").getAsString());
			address.setState(addressJson.get("estado").getAsString());
			return address;
		} catch (IOException | InterruptedException e) {
			System.err.print("Invalid CEP!");
			e.printStackTrace();
			return null;
		}
	}

}
