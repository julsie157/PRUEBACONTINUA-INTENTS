package com.example.prueba19dec;

public class Book {
    private String titulo;
    private int paginas;
    private String autor;
    private int anio;

    public Book(String titulo, int paginas, String autor, int anio) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


    @Override
    public String toString() {
        return "Book{" +
                "titulo='" + titulo + '\'' +
                ", paginas=" + paginas +
                ", autor='" + autor + '\'' +
                ", anio=" + anio +
                '}';
    }

}
