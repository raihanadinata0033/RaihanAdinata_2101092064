/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raihan.DAO;
import Raihan.model.Buku;
import java.util.List;
/**
 *
 * @author ACER
 */
public interface BukuDao {
    Buku save(Buku buku);
    Buku update(int index, Buku buku);
    Buku delete(int index);
    Buku getBuku(int index);
    List<Buku> getAllBuku();
}
