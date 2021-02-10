package com.sda.zaawansowane.wstepoop.zajecia.zadanie4;

public final class Biblioteka {

    private final Egzemplarz[] listaEgzemplarzy;
    private final Autor[] listaAutorow;

    private int egzemplarzCount;
    private int autorCount;

    public Biblioteka() {
        listaEgzemplarzy = new Egzemplarz[1000];
        listaAutorow = new Autor[100];
        egzemplarzCount = 0;
        autorCount = 0;
    }

    public void dodajAutora(Autor autor) {
        listaAutorow[autorCount++] = autor;
        Egzemplarz[] egzemplarzList = autor.getEgzemplarzList();
        for (int i = 0; i < autor.getEgzemplarzCount(); i++) {
            listaEgzemplarzy[egzemplarzCount++]=egzemplarzList[i];
        }
    }

    public void dodajEgzemplarz(Egzemplarz egzemplarz) {
        listaEgzemplarzy[egzemplarzCount++] = egzemplarz;
    }

    public void szukajPoTytule(String tytul) {
        System.out.println("Lista egzemplarzy odpowiadająca szukanemu tytulowi (" + tytul + ")");

        for (int i = 0; i < egzemplarzCount; i++) {
            if(listaEgzemplarzy[i].getTytul().toLowerCase().contains(tytul)){
                System.out.println(listaEgzemplarzy[i]);
            }
        }

        System.out.println("--------------------");
    }

    public void szukajPoAutorze(String autor) {
        System.out.println("Lista autorów odpowiadająca szukanej frazie (" + autor + ")");

        for (int i = 0; i < autorCount; i++) {
            if(listaAutorow[i].getFullName().toLowerCase().contains(autor)){
                System.out.println(listaAutorow[i]);
            }
        }

        System.out.println("--------------------");
    }

    public void szukajPoAutorzeLubTytule(String fraza){
        System.out.println("Lista obiektów odpowiadająca szukanej frazie (" + fraza + ")");
        szukajPoAutorze(fraza);
        szukajPoTytule(fraza);
        System.out.println("--------------------");
    }

    public Autor znajdzAutoraONajwiekszymDorobku(){
        Autor resultAutor = null;
        if(autorCount==0){
            return resultAutor;
        }else {
            resultAutor = listaAutorow[0];

            for (int i = 1; i < autorCount; i++) {
                if(listaAutorow[i].getWszystkieStrony()> resultAutor.getWszystkieStrony()){
                    resultAutor=listaAutorow[i];
                }
            }
        }
        return resultAutor;
    }

}
