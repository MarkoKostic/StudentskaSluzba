# StudentskaSluzba
Student Services - Project in Eclipse 

Link for Database -> https://drive.google.com/open?id=16ZL62Rr_u7M76Gez3K7Q2a6Oe0_rzfuq

Prvi deo:

- Napisati shemu relacione baze podataka studentske službe. 
Baza se sastioji od studenata i profesora koji su korisnici sistema. Svi korisnici mogu da se autentifikuju na sistem pomoću korisničkog imena i lozinke. Lozinke su kriptovane u bazi pomoću hash funkcije (hash funkciju implementirati po sopstvenoj želji). Jedan student može da pohađa samo jedan fakultet, dok profesori mogu da predaju na više fakulteta. Student polaže jedan ispit iz jednog predmeta kod jednog profesora. Fakultet se nalazi u jednom mestu. Isto tako, svaki student i svaki profesor je prijavljen u jednom mestu.
- Za studenta je važno ime i prezime, pol i godina rodjenja, kao i za profesora. Student dodatno ima sport i hobi kojim se bavi, a profesor seminar koji pohadja. Predmet ima naziv i broj ESPB bodova. Ispit se zakazuje u odredjeno vreme u odredjenom amfiteatru (A1, A2, ..., A5), a student iz ispita na kraju dobija ogenu (5, 6, ..., 10). Mesto ima naziv i poštanski broj, a fakultet ima naziv i skraćenicu (FTN, PMF, ETF, FON, ...)


Drugi deo:

- Koristeći Hiberate kao ORM, odrediti sve potrebne anotacije na entitetima. Iskomentarisati tipove podataka i vrste veza, kartinalitete kao i smerove veza gde je to potrebno.
- Napisati CRUD logiku za studente, profesore, fakultete, mesta i predmete.
- Napisati biznis logiku za prijavljivanje i odjavljivanje korisnika, izlistavanje svih predmeta koje je student položio, izlistavanje svih predmeta koje profesor drži, izlistavanje svih profesora zaposlenih na fakultetu, kao i studenata koji pohadjaju odredjeni fakultet. Implementirati dodavanje novog ispita, kao i ocenjivanje (update zbog ocene)


Treći deo

- Za sve ove funkcionalnosti informacionof sistema studentske službe napisati odgovarajuće forme u HTML i stilizovati ih pomoću CSS-a
