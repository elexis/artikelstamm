#!/usr/bin/env bash
rm -f MedIndexDownload.jar ArtikelstammBuilderv6.jar Elexis_Artikelstamm_v6.xsd
rm -Rf medindex/
wget https://github.com/elexis/artikelstamm/releases/download/0.3/MedIndexDownload.jar
wget https://github.com/elexis/artikelstamm/releases/download/0.3/ArtikelstammBuilderv6.jar
wget https://github.com/elexis/artikelstamm/releases/download/0.3/Elexis_Artikelstamm_v6.xsd

docker run --rm -v "$(pwd)":/prog -w /prog adoptopenjdk/openjdk8:alpine java -XX:MaxRAMPercentage=75.0 -jar MedIndexDownload.jar ${HCI_USERNAME} ${HCI_PASSWORD}

docker run --rm -v "$(pwd)":/prog -w /prog adoptopenjdk/openjdk8:alpine java -XX:MaxRAMPercentage=75.0  -jar ArtikelstammBuilderv6.jar \
-emediatProductFile medindex/medindex_product.xml \
-emediatArticleFile medindex/medindex_article.xml \
-emediatArticlePriceFile medindex/medindex_article_price.xml \
-emediatCodeFile medindex/medindex_code.xml \
-emediatLimitationFile medindex/medindex_limitation.xml \
-artikelstammSchema Elexis_Artikelstamm_v6.xsd

gzip medindex/artikelstamm_medindex*
