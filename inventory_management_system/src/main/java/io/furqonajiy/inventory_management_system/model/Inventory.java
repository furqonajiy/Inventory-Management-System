package io.furqonajiy.inventory_management_system.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "inventories")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String SKU;

    @Column(name = "main_keyword")
    private String mainKeyword;
    
    @Column(name = "inventory_type")
    private String inventoryType;
    
    @Column(name = "notes")
    private String notes;
    
    @Column(name = "use")
    private String use;
    
    @Column(name = "alternative_keyword")
    private String alternativeKeyword;
    
    @Column(name = "bisa_divisi")
    private String bisaDivisi;
    
    @Column(name = "mass_in_gram")
    private int    massInGram;
    
    @Column(name = "hash_tag")
    private String hashTag;
    
    @Column(name = "bukalapak_link")
    private String bukalapakLink;
    
    @Column(name = "tokopedia_link")
    private String tokopediaLink;
    
    @Column(name = "shopee_link")
    private String shopeeLink;
    

    public Inventory(String SKU, String mainKeyword, String inventoryType, 
                     String notes, String use, String alternativeKeyword,
                     String bisaDivisi, int massInGram, String hashTag,
                     String bukalapakLink, String tokopediaLink, String shopeeLink) {
        
        super();
        this.SKU = SKU;
        this.mainKeyword = mainKeyword;
        this.inventoryType = inventoryType;
        this.notes = notes;
        this.use = use;
        this.alternativeKeyword = alternativeKeyword;
        this.bisaDivisi = bisaDivisi;
        this.massInGram = massInGram;
        this.hashTag = hashTag;
        this.bukalapakLink = bukalapakLink;
        this.tokopediaLink = tokopediaLink;
        this.shopeeLink = shopeeLink;

    }

    public String GetSKU() {
        return SKU;
    }
    public void SetSKU(String SKU) {
        this.SKU = SKU;
    }

    public String GetMainKeyword() {
        return mainKeyword;
    }
    public void SetMainKeyword(String mainKeyword) {
        this.mainKeyword = mainKeyword;
    }

    public String GetInventoryType() {
        return inventoryType;
    }
    public void SetInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public String GetNotes() {
        return notes;
    }
    public void SetNotes(String notes) {
        this.notes = notes;
    }

    public String GetUse() {
        return use;
    }
    public void SetUse(String use) {
        this.use = use;
    }

    public String GetAlternativeKeyword() {
        return alternativeKeyword;
    }
    public void SetAlternativeKeyword(String alternativeKeyword) {
        this.alternativeKeyword = alternativeKeyword;
    }

    public String GetBisaDivisi() {
        return bisaDivisi;
    }
    public void SetBisaDivisi(String bisaDivisi) {
        this.bisaDivisi = bisaDivisi;
    }

    public int GetMassInGram() {
        return massInGram;
    }
    public void SetMassInGram(int massInGram) {
        this.massInGram = massInGram;
    }

    public String GetHashTag() {
        return hashTag;
    }
    public void SetHashTag(String hashTag) {
        this.hashTag = hashTag;
    }

    public String GetBukalapakLink() {
        return bukalapakLink;
    }
    public void SetBukalapakLink(String bukalapakLink) {
        this.bukalapakLink = bukalapakLink;
    }

    public String GetTokopediaLink() {
        return tokopediaLink;
    }
    public void SetTokopediaLink(String tokopediaLink) {
        this.tokopediaLink = tokopediaLink;
    }

    public String GetShopeeLink() {
        return shopeeLink;
    }
    public void SetShopeeLink(String shopeeLink) {
        this.shopeeLink = shopeeLink;
    }

}
