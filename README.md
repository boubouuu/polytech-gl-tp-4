# TD — Collaboration, CI/CD, SonarCloud et Déploiement (15 cas)

Ce dépôt contient une petite application Java qui sert de support au TD.
Il est conçu pour que chaque étudiant·e prenne en charge **un cas** parmi 15 :
dans chaque classe `CaseXService` :

- un morceau de **code existant avec au moins une issue Sonar** (code smell, bug simple, duplication, etc.) ;
- une **petite feature à implémenter** (méthode `TODO` avec comportement simple) ;
- à tester à l'aide d'un test unitaire JUnit.

## Objectifs pédagogiques

- Travailler sur une branche à partir d'un dépôt partagé.
- Ouvrir une Pull Request et la faire valider par la CI.
- Observer la Quality Gate Sonar sur le **new code**.
- Corriger des issues Sonar et ajouter des tests unitaires.
- Déployer la Javadoc sur GitHub Pages (workflow fourni).

## Démarrage rapide

```bash
git clone https://github.com/<OWNER>/<REPO>.git
cd <REPO>
mvn -q -B clean verify
```

## Cas disponibles

Chaque étudiant·e se voit affecter une classe de service :

1. `Case1DiscountService`
2. `Case2LoyaltyPointsService`
3. `Case3ShippingCostService`
4. `Case4InvoiceFormatterService`
5. `Case5TemperatureConverterService`
6. `Case6StringUtilsService`
7. `Case7StatisticsService`
8. `Case8PasswordStrengthService`
9. `Case9InventoryService`
10. `Case10BookingService`
11. `Case11TaxService`
12. `Case12PromotionService`
13. `Case13EmailValidatorService`
14. `Case14OrderStatusService`
15. `Case15CurrencyConverterService`

Dans chaque classe :

- une méthode marquée comme **issue existante à corriger** ;
- une méthode marquée comme **feature à implémenter et tester**.

## CI / CD

- Workflow `ci.yml` : build + tests + analyse SonarCloud.
- Workflow `deploy-docs.yml` : génération et publication automatique de la Javadoc.
- Workflow `release.yml` : publication du JAR sur GitHub Release à chaque tag `v*`.

Les secrets Sonar (`SONAR_TOKEN`) et la configuration GitHub Pages sont supposés configurés **par l’enseignant**.

---

Rapport mutation testing : https://boubouuu.github.io/polytech-gl-tp-3/fr.polytech.gl.tp3/index.html

© Usage pédagogique.
