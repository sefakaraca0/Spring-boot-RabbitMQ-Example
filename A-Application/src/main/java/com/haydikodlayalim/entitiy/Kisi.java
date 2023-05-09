package com.haydikodlayalim.entitiy;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Table(name = "kisi")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode( of ={"id"})
@ToString
public class Kisi {

    @Id
    @SequenceGenerator(name = "seq_kisi ", allocationSize = 1)
    @GeneratedValue(generator = "seq_kisi",strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 100,name = "adi", nullable = false)
    private String adi;

    @Column (length = 100,name = "soyadi")
    private String soyadi;

    @OneToMany
    @JoinColumn(name = "kisi_adres_id")
    private List<Adres> adresleri;



}
