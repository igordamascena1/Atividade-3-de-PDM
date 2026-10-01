import java.util.ArrayList;

public class PaisData {

    public static ArrayList<Pais> getPaises() {

        ArrayList<Pais> paises = new ArrayList<>();

        paises.add(new Pais(
                "Brasil",
                "Brasília",
                "América do Sul",
                "https://flagcdn.com/w320/br.png"
        ));

        paises.add(new Pais(
                "Argentina",
                "Buenos Aires",
                "América do Sul",
                "https://flagcdn.com/w320/ar.png"
        ));

        paises.add(new Pais(
                "Chile",
                "Santiago",
                "América do Sul",
                "https://flagcdn.com/w320/cl.png"
        ));

        paises.add(new Pais(
                "Canadá",
                "Ottawa",
                "América do Norte",
                "https://flagcdn.com/w320/ca.png"
        ));

        paises.add(new Pais(
                "Estados Unidos",
                "Washington, D.C.",
                "América do Norte",
                "https://flagcdn.com/w320/us.png"
        ));

        paises.add(new Pais(
                "México",
                "Cidade do México",
                "América do Norte",
                "https://flagcdn.com/w320/mx.png"
        ));

        paises.add(new Pais(
                "Portugal",
                "Lisboa",
                "Europa",
                "https://flagcdn.com/w320/pt.png"
        ));

        paises.add(new Pais(
                "Espanha",
                "Madri",
                "Europa",
                "https://flagcdn.com/w320/es.png"
        ));

        paises.add(new Pais(
                "França",
                "Paris",
                "Europa",
                "https://flagcdn.com/w320/fr.png"
        ));

        paises.add(new Pais(
                "Alemanha",
                "Berlim",
                "Europa",
                "https://flagcdn.com/w320/de.png"
        ));

        paises.add(new Pais(
                "Itália",
                "Roma",
                "Europa",
                "https://flagcdn.com/w320/it.png"
        ));

        paises.add(new Pais(
                "Reino Unido",
                "Londres",
                "Europa",
                "https://flagcdn.com/w320/gb.png"
        ));

        paises.add(new Pais(
                "Japão",
                "Tóquio",
                "Ásia",
                "https://flagcdn.com/w320/jp.png"
        ));

        paises.add(new Pais(
                "China",
                "Pequim",
                "Ásia",
                "https://flagcdn.com/w320/cn.png"
        ));

        paises.add(new Pais(
                "Índia",
                "Nova Délhi",
                "Ásia",
                "https://flagcdn.com/w320/in.png"
        ));

        return paises;
    }
}
