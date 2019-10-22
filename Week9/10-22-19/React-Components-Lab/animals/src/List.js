import React, { Component } from 'react';

import Card from './Card.js';

let animals = [{
  image: "https://mykombini-ab5a.kxcdn.com/48475-large/ultra-detail-figure-no368-udf-pixar-series-2-toy-story-rex-medicom-toy.jpg",
  title: "T-rex",
  description: "It's big and scaly"
}, {
  image: "https://www.clipartwiki.com/clipimg/detail/4-41797_story-toy-sheriff-potato-dog-slinky-woody-slinky.png",
  title: "Slinky Dog",
  description: "A hot dog pupper"
},
{
  image: "https://vignette.wikia.nocookie.net/pixar/images/8/81/599F1B3D-EF94-4339-A280-81241A53685E.jpeg",
  title: "Ham",
  description: "Bacon"
}
]

class List extends Component {
  render() {
    return (
      <div>
      {animals.map((animal, index) =>
        <Card key = {index} image ={animal.image} title={animal.title}
        description={animal.description}/>
      )}
      </div>
    )
  }
}

export default List;
