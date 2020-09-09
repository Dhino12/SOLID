package Belajar_SOLID_06_OOP_Association;

import java.util.List;

class Penjual {
    private String id;
    private String name;
}

class Pembeli{
    private String id;
    private String name;
    private List<Penjual> Penjual; // One To Many Relationship
}
