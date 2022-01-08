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
    @Column(name = "sku")
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

    public Inventory() {
        
    }

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

    public String getSKU() {
        return SKU;
    }
    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getMainKeyword() {
        return mainKeyword;
    }
    public void setMainKeyword(String mainKeyword) {
        this.mainKeyword = mainKeyword;
    }

    public String getInventoryType() {
        return inventoryType;
    }
    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getUse() {
        return use;
    }
    public void setUse(String use) {
        this.use = use;
    }

    public String getAlternativeKeyword() {
        return alternativeKeyword;
    }
    public void setAlternativeKeyword(String alternativeKeyword) {
        this.alternativeKeyword = alternativeKeyword;
    }

    public String getBisaDivisi() {
        return bisaDivisi;
    }
    public void setBisaDivisi(String bisaDivisi) {
        this.bisaDivisi = bisaDivisi;
    }

    public int getMassInGram() {
        return massInGram;
    }
    public void setMassInGram(int massInGram) {
        this.massInGram = massInGram;
    }

    public String getHashTag() {
        return hashTag;
    }
    public void setHashTag(String hashTag) {
        this.hashTag = hashTag;
    }

    public String getBukalapakLink() {
        return bukalapakLink;
    }
    public void setBukalapakLink(String bukalapakLink) {
        this.bukalapakLink = bukalapakLink;
    }

    public String getTokopediaLink() {
        return tokopediaLink;
    }
    public void setTokopediaLink(String tokopediaLink) {
        this.tokopediaLink = tokopediaLink;
    }

    public String getShopeeLink() {
        return shopeeLink;
    }
    public void setShopeeLink(String shopeeLink) {
        this.shopeeLink = shopeeLink;
    }

}
