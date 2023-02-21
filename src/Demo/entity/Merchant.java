package Demo.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Merchant extends User{
        ArrayList<Film> film=new ArrayList<>();



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Merchant)) return false;
        if (!super.equals(o)) return false;
        Merchant merchant = (Merchant) o;
        return film.equals(merchant.film);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), film);
    }

    @Override
    public String toString() {
        return "Merchant{" +super.toString()+
                "film=\n" + film +
                '}';
    }

    public ArrayList<Film> getFilm() {
        return film;
    }

    public void setFilm(ArrayList<Film> film) {
        this.film = film;
    }



    public Merchant(String userName, String account, int password) {
        super(userName, account, password);
    }
    public Merchant(String userName, String account, int password, boolean id) {
        super(userName, account, password, id);
    }
    public Merchant(String userName, String account, int password, boolean id, ArrayList<Film> film) {
        super(userName, account, password, id);
        this.film = film;
    }

    public Merchant(ArrayList<Film> film) {
        this.film = film;
    }
}
