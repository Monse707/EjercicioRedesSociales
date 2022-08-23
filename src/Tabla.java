import sun.rmi.runtime.Log;

import java.util.List;

public class Tabla {

    RedSocial Facebook = new RedSocial();
    RedSocial Twitter = new RedSocial();
    RedSocial Youtube = new RedSocial();

    public Tabla(List<String> myList) {
        for (int i=1; i < myList.size(); i++){
            String[] datos = myList.get(i).split(",");
            switch (datos[0]){
                case "FACEBOOK":
                {
                    switch (datos[1]){
                        case "SEGUIDORES":
                            this.Facebook.Enero.Seguidores = Integer.parseInt(datos[3]);
                            this.Facebook.Febrero.Seguidores = Integer.parseInt(datos[4]);
                            this.Facebook.Marzo.Seguidores = Integer.parseInt(datos[5]);
                            this.Facebook.Abril.Seguidores = Integer.parseInt(datos[6]);
                            this.Facebook.Mayo.Seguidores = Integer.parseInt(datos[7]);
                            this.Facebook.Junio.Seguidores = Integer.parseInt(datos[8]);
                            this.Facebook.Julio.Seguidores = Integer.parseInt(datos[9]);
                            this.Facebook.Agosto.Seguidores = Integer.parseInt(datos[10]);
                            this.Facebook.septiembre.Seguidores = Integer.parseInt(datos[11]);
                            this.Facebook.Octubre.Seguidores = Integer.parseInt(datos[12]);
                            this.Facebook.Noviembre.Seguidores = Integer.parseInt(datos[13]);
                            this.Facebook.Diciembre.Seguidores = Integer.parseInt(datos[14]);


                            break;
                        case "CRECIMIENTO":
                            break;
                        case "PORCENTAJE DE CRECIMIENTO":
                            break;
                        case "PUBLICACIONES":
                            break;
                        case "ME GUSTA EN PUBLICACIONES":
                            break;
                        case "PUBLICACIONES COMPARTIDAS":
                            break;
                        case "COMENTARIOS":
                            break;
                    }
                    break;
                }
            }


        }



    }
}
