const express = require('express');

const app = express();

app.set('view engine', 'ejs');

app.get('/', (req, res) => {
  res.render('home');
});

const port = 5000;

app.listen(port, () => console.log(`server started on port ${port}`));