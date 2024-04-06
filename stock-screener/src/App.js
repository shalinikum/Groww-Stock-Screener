import NavBar from './Component/Navbar';
import Filter from './Component/Filter';
import FilterStocks from './Component/FilterStocks';
import FilterData from './Component/Filetrdata';

function App() {
  return (
    <div className="App">
      <NavBar/>
      <div style={{display: 'flex'}}>
        <div style={{overflowY: 'scroll'}}><FilterData/></div>
        <FilterStocks/>
      </div>
      
    </div>
  );
}

export default App;


