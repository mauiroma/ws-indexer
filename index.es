PUT /wsindex
{
  "mappings": {
    "properties": {
      "country_name": {
        "type": "text"
      },
      "country_population": {
        "type": "integer"
      },
      "country_capital": {
        "type": "text"
      },
      "country_currency": {
        "type": "keyword"
      }
    }
  }
}