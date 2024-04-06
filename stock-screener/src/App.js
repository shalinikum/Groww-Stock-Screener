import logo from './logo.svg';
import './App.css';
import NavBar from './Component/Navbar';
import Filter from './Component/Filter';
import FilterStocks from './Component/FilterStocks';

function App() {
  return (
    <div className="App">
      <NavBar/>
      <Filter/>
      <FilterStocks/>
    </div>
  );
}

export default App;
