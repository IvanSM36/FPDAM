using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace T01_ListView_IvanSM
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        // Creamos una lista de persona
        List<Persona> lp = new List<Persona>();

        public MainWindow()
        {
            InitializeComponent();
        }

        private void agregarPersona(Object sender, RoutedEventArgs e)
        {
            lp.Add(new Persona() {Nombre = "Ivan", Apellidos = "Salguero", Dni = "44444444-W", Email= "ivan_sm@hotmail.es", Edad = 26 });
        }
    }
}
