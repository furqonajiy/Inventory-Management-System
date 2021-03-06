import logo from './logo.svg';
import './App.css';
import ListInventoryComponent from './components/ListInventoryComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';

function App() {
  return (
    <div>
      <HeaderComponent />

			<div className="container">
				<ListInventoryComponent />
			</div>

			<FooterComponent />
		</div>
  );
}

export default App;
