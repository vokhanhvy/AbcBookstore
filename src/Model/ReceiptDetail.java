 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author KHANH VY
 */
public class ReceiptDetail {
    String receiptId, bookId, bookName;
    int quantity, empId;
    long price, total;

    public ReceiptDetail(String receiptId, String bookId, String bookName,int quantity, int empId, long price, long total) {
        this.receiptId = receiptId;
        this.bookId = bookId;
        this.bookName = bookName;
        this.quantity = quantity;
        this.empId = empId;
        this.price = price;
        this.total = total;
    }

    public ReceiptDetail() {
    }

    public ReceiptDetail(String receiptId, String bookId) {
        this.receiptId = receiptId;
        this.bookId = bookId;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    
}
