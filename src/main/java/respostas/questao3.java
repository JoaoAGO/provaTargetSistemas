package respostas;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Faturamento;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class questao3 {
    public static void main(String[] args) {
        try {
            String json = String.join(" ", Files.readAllLines(Paths.get("src/main/resources/dados.json"), StandardCharsets.UTF_8));
            List<Faturamento> listFaturamento = new Gson().fromJson(json, new TypeToken<List<Faturamento>>() {
            }.getType());
            double max = listFaturamento.stream().map(Faturamento::getValor).max(Double::compareTo).get();
            double min = listFaturamento.stream().map(Faturamento::getValor).filter(it -> it > 0).min(Double::compareTo).get();
            Double reduce = listFaturamento.stream().map(Faturamento::getValor).reduce(0.0, Double::sum);
            long dias = listFaturamento.stream().filter(it -> it.getValor() > 0).count();
            System.out.println("O maior valor de faturamento ocorrido em um dia do mês foi: " + max);
            System.out.println("O menor valor de faturamento ocorrido em um dia do mês foi: " + min);
            System.out.println("O número de dias no mês em que o valor de faturamento diário foi superior à média mensal foi:" + reduce/dias);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
